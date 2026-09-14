# Great Tournament of Shields

Phase 1 (Journal):
- In a large-scale MMORPG, each “Guardian” is a player-controlled or AI-assisted unit with a DefenseRating that determines how much damage it can absorb before being destroyed. This value is used in combat calculations, matchmaking, and progression systems.
- If the game’s client code allowed outside code (e.g., a cheat tool like Cheat Engine) to directly write to the DefenseRating variable in memory, a player could instantly set it to a very high number. This would make the Guardian effectively invulnerable in combat, bypassing intended balance and damage formulas.

Phase 2 (Journal):
- When the fields went private, several errors occurred within the defenseRating and computedProperty.
- It was a struggle but I left it because it was too complicated to fix.
- It is preferred practice because it highlights the difference between public and private encapsulations.

Phase 3 (Journal):
- If you store isLegendary as a separate boolean field instead of calculating it from defenseRating on demand, you'd introduce data synchronization to responsibilities and risks.
- DefenseRating changes: Detect the change, Recalculate isLegendary, Update the stored field and Ensure all update paths are covered
- Risks of storing derived data: Data inconsistency, Increased maintenance complexity, Harder debugging, Redundant storage, Risk of stale data in distributed systems in multi-server or cached environments, one copy of the data might be updated while another is not.

Phase 4 (Journal): 
- In Java, private means private to the class, not to the specific object instance. That’s why in your Guardian class, if opponent is also a Guardian (or any instance of the same class), your method can directly access opponent.defenseRating even though it’s marked private.
- Pro's: Encapsulation, Validation / Transformation, API Consistency and Future-proofing.
- Con's: Slight Performance Overhead, Verbosity and Potential for Unintended Behavior.
